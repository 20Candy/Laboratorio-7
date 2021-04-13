package implementacion;

import estructura.ArbolBinarioBusqueda;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

import estructura.IVisitar;
import estructura.NodoArbol;



public class traductor {

    public traductor(String name){

        //lee el archivo

        ArbolBinarioBusqueda<String, diccionario> arbol;
        arbol = new ArbolBinarioBusqueda<String, diccionario>(
            new ComparadorDiccionario<String, diccionario>()
            , new GetKeyIngles<String, diccionario>()
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
            }
        }catch(IOException e) {
            System.out.print("Error" + e.getMessage());
            e.printStackTrace();
        }

        //verifica la traduccion linea por linea y guardarla en String

        String listadoElementos = "";





        //Envia el String a traducido.txt

        File archivo;
		archivo = new File("traducido.txt");
		
		 
		try {
			FileWriter fw = new FileWriter(archivo, false);
			fw.write(listadoElementos);
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
    }


}