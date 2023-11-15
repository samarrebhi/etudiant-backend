package samar.steps.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="bloc")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
}

