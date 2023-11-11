package samar.steps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samar.steps.entities.Bloc;
import samar.steps.repositories.BlocRepository;

import java.util.List;


@Service
public class BlocService implements IBlocService{

    @Autowired
    private BlocRepository b;

    @Override
    public Long addBloc(Bloc bloc) {

        return b.save(bloc).getIdBloc();
    }

    @Override
    public List<Bloc> getAllBloc() {

       return (List<Bloc>) b.findAll();

    }
}
