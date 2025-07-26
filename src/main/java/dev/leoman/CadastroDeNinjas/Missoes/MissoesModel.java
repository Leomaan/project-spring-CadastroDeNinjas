package dev.leoman.CadastroDeNinjas.Missoes;

import dev.leoman.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String dificulty;

    @OneToMany(mappedBy = "missao") //Uma missão pode ter muitos ninjas
    private NinjaModel ninja;

    public MissoesModel(long id, String dificulty, String name) {
        this.id = id;
        this.dificulty = dificulty;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getDificulty() {
        return dificulty;
    }

    public String getName() {
        return name;
    }

    public MissoesModel() {
    }
}
