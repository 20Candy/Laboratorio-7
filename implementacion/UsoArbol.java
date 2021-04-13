package implementacion;

import estructura.ArbolBinarioBusqueda;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class UsoArbol {
    

    public static void main(String[] args) {
		ArbolBinarioBusqueda<String, diccionario> arbol;
		arbol = new ArbolBinarioBusqueda<String, diccionario>(
				new ComparadorDiccionario<String, diccionario>()
				, new GetKeyIngles<String, diccionario>()
				);

        ArbolBinarioBusqueda<String, diccionario> arbol1;
		arbol1 = new ArbolBinarioBusqueda<String, diccionario>(
				new ComparadorDiccionario<String, diccionario>()
				, new GetKeyEspanol<String, diccionario>()
				);

        ArbolBinarioBusqueda<String, diccionario> arbol2;
        arbol2 = new ArbolBinarioBusqueda<String, diccionario>(
                new ComparadorDiccionario<String, diccionario>()
                , new GetKeyFrances<String, diccionario>()
                );

        
        try {
            File miArchivo = new File("datos.txt");
            Scanner myReader = new Scanner(miArchivo);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] values = line.split(",");
                arbol.Insert(values[0], new diccionario(
                        values[0]
                        , values[1]
                        ,(values[2])
                    )
                );

                arbol1.Insert(values[0], new diccionario(
                        values[0]
                        , values[1]
                        ,(values[2])
                    )
                );

                arbol2.Insert(values[0], new diccionario(
                        values[0]
                        , values[1]
                        ,(values[2])
                    )
                );
            }
        }catch(IOException e) {
            System.out.print("Error" + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(" \n*** LISTADO DE AUTOS EN CONSOLA EN INGLES*** ");
		arbol.InOrder(new ListarDiccionarioI(), arbol._raiz);

        System.out.println(" \n*** LISTADO DE AUTOS EN CONSOLA EN ESPAÑOL*** ");
		arbol.InOrder(new ListarDiccionarioE(), arbol1._raiz);


        System.out.println(" \n*** LISTADO DE AUTOS EN CONSOLA EN FRANCES*** ");
		arbol.InOrder(new ListarDiccionarioF(), arbol2._raiz);

        System.out.println(" \n*** TRADUCCION DE TEXTO EN traducido.txt*** ");


    }
		
		
}
