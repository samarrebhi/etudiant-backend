package samar.steps.services;

import samar.steps.entities.Bloc;

import java.util.List;

public interface IBlocService {

    public Long addBloc(Bloc bloc);
    public List<Bloc> getAllBloc();
}
