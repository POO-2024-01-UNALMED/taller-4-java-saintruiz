package classroom;

public class Taller4 {

    public static void main(String[] args) {
        Persona[] estudiantes1 = new Persona[3];
        estudiantes1[0] = new Persona(188220);
        //Nombre="", Cédula=188220

        estudiantes1[1] = new Persona();
        //Nombre="", Cédula=0

        estudiantes1[2] = new Persona(71212, "Maria");
        //Nombre=Maria, cédula= 71212

        Persona profesor1 = new Persona("Juan", 988);
        //Nombre= Juan, cédula=988

        Asignatura asignatura1 = new Asignatura("Calculo",Tipo.FUNDAMENTACION);
        //Nombre=Cálculo, tipo= Fundamentación, codExt=0, codInt=0

        Grupo grupo1 = new Grupo(estudiantes1, profesor1, asignatura1, 10023, "M J 2-4");
        //Estudiantes= estudiantes1, profesor= profesor1, asignatura=asignatura1, código=10023, horario= M J 2-4


        Persona profesor2 = new Persona(99212, "Andrea");
        //Nombre=Andrea, cédula=99212

        Asignatura asignatura2 = new Asignatura(882,Tipo.DISCIPLINAR);
        //Nombre=Sin nombre, codInt=0, codExt=882, Tipo=Disciplinar

        asignatura2.setCodigoInterno(98);
        //Nombre=Sin nombre, codInt=98, codExt=882, Tipo=Disciplinar

        asignatura2.cambiarDatos("Estadistica");
        //Nombre=Estadistica, codInt=0, codExt=882, Tipo=Disciplinar

        Grupo grupo2 = new Grupo(2, profesor2, asignatura2, 10122, "W V 8-10");
        //Estudiantes=[none, none], profesor=Andrea, Asignatura=Estadística, codigo=10122, horario= W V 8-10
        grupo2.cambiarEstudiante(0, estudiantes1[0]);
        //Estudiantes=[(Nombre="", Cédula=188220), none], profesor=Andrea, Asignatura=Estadística, codigo=10122, horario= W V 8-10
        grupo2.cambiarEstudiante(1, estudiantes1[2]);
        //Estudiantes=[(Nombre="", Cédula=188220),(Nombre=Maria, cédula= 71212)], profesor=Andrea, Asignatura=Estadística, codigo=10122, horario= W V 8-10
        grupo2.cambiarEstudiante(estudiantes1[0], estudiantes1[1]);
        //Estudiantes=[(Nombre="", Cédula=0),(Nombre=Maria, cédula= 71212)], profesor=Andrea, Asignatura=Estadística, codigo=10122, horario= W V 8-10

        System.out.println(new Asignatura().nombre);
        System.out.println(grupo2.codigo);
        System.out.println(asignatura2.codigoExterno);
        asignatura1.cambiarDatos(50);
        System.out.println(asignatura1.codigoExterno);
        System.out.println(estudiantes1[1].cedula);
        System.out.println(new Persona("Alejandro").cedula);
    }
}


//Sin nombre
//101122
//882
//50
//0
//1
