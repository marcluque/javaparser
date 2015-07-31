package me.tomassetti.symbolsolver.model;

import me.tomassetti.symbolsolver.model.javaparser.UnsolvedSymbolException;

import java.util.Optional;

/**
 * Created by federico on 30/07/15.
 */
public class DummyTypeSolver implements TypeSolver {

    @Override
    public SymbolReference<TypeDeclaration> tryToSolveType(String name) {
        return SymbolReference.unsolved(TypeDeclaration.class);
    }

    @Override
    public ClassDeclaration solveType(String name) throws UnsolvedSymbolException {
        throw new UnsolvedSymbolException(null, name);
    }
}
