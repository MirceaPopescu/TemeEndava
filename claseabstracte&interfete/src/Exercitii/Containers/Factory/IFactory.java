package Exercitii.Containers.Factory;

import Exercitii.Containers.Container;

/**
 * Created by mipopescu on 7/11/2016.
 */
public interface IFactory {
    /**
     * Creaza un container care implementeaza strategia primita ca parametru.
     * @param strategy Strategia ceruta
     * @return Un container care respecta strategia primita ca parametru.
     */
    Container createContainer(strategy strategy);
}
