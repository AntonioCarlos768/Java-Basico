package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Responsavel;
import modelo.Sala;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-02T10:09:10")
@StaticMetamodel(Patrimonio.class)
public class Patrimonio_ { 

    public static volatile SingularAttribute<Patrimonio, Integer> numero;
    public static volatile SingularAttribute<Patrimonio, Sala> sala;
    public static volatile SingularAttribute<Patrimonio, Double> valor;
    public static volatile SingularAttribute<Patrimonio, Responsavel> siaperesp;
    public static volatile SingularAttribute<Patrimonio, Date> dataDesfazimento;
    public static volatile SingularAttribute<Patrimonio, Date> dataaquisicao;
    public static volatile SingularAttribute<Patrimonio, Date> dataAquisicao;
    public static volatile SingularAttribute<Patrimonio, String> descricao;

}