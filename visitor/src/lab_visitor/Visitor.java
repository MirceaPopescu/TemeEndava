package lab_visitor;

import java.util.LinkedList;

public interface Visitor {
    public void visit(Employee e);

    public void visit(Boss b);

    public void visit(Intern intern);
}

/**
 * Visitor for printing an employee's data. Applies the operation only on objects
 * that implement Visitable, currently Employee and Boss.
 */
class RevenueVisitor implements Visitor {
    @Override
    public void visit(Employee e) {
        System.out.println(e.getName() + " " + e.getSalary());
    }

    @Override
    public void visit(Boss b) {
        System.out.println(b.getName() + " " + (b.getSalary() + b.getBonus()));
    }

    @Override
    public void visit(Intern intern) {

    }
}

/**
 * Visitor for finding if the average number of extra hours for bosses is higher
 * than the one for employees.
 * <p>
 * Interns are not taken into consideration.
 */

class MostHardworkingEmployeeFinder implements Visitor {
    int employeeCount;
    int bossCount;
    int employeeHours;
    int bossHours;

    MostHardworkingEmployeeFinder() {
        employeeHours = 0;
        employeeCount = 0;
        bossCount = 0;
        bossHours = 0;
    }

    @Override
    public void visit(Employee e) {
        System.out.println(e.getName() + " has " + e.getExtraHours() + " extra hours");
        employeeCount++;
        employeeHours += e.getExtraHours();
    }

    @Override
    public void visit(Boss b) {
        System.out.println(b.getName() + " has " + b.getExtraHours() + " extra hours");
        bossCount++;
        bossHours += b.getExtraHours();
    }

    @Override
    public void visit(Intern intern) {

    }

    public boolean isBossHardWorking() {
        if (bossCount > 0 && employeeCount > 0) {
            System.out.println(bossHours + " / " + bossCount);
            System.out.println(employeeHours + " / " + employeeCount);
            return bossHours / bossCount > employeeHours / employeeCount;
        } else {
            return false;
        }
    }
}


/**
 * Visitor for tree traversal - separate the concerns: a visitor for data
 * operations (e.g. compute average percentage) and this visitor for traversing
 * the nodes and applying the operation visitor.
 */

class TreeVisitor implements Visitor {

    private Visitor baseVisitor;

    public TreeVisitor(Visitor baseVisitor) {
        this.baseVisitor = baseVisitor;
    }

    @Override
    public void visit(Employee e) {
        System.out.println("Visiting employee " + e.getName());
        e.accept(baseVisitor);
    }

    @Override
    public void visit(Boss b) {
        System.out.println("Visiting boss " + b.getName());
        LinkedList<Visitable> subordinates = b.getSubordinates();
        for (Visitable subordinate : subordinates) {
            subordinate.accept(this);
        }

        b.accept(baseVisitor);
    }

    @Override
    public void visit(Intern intern) {

    }

    public Visitor getBaseVisitor() {
        return baseVisitor;
    }
}