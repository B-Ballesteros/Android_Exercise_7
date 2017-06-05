package itesm.mx.m1_jbbm_labo_libros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by benji on 11/02/17.
 */

public class LibroAdapter extends ArrayAdapter<Libro>{

    //region Constructor
    public LibroAdapter(Context context, ArrayList<Libro> libros){
        super(context, 0, libros);
    }
    //endregion

    //region Overrides
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Libro libro = getItem(position);

        //convertView --> vista a reutilizar si es nulo se crea
        convertView = (convertView == null) ?
                LayoutInflater.from(getContext()).inflate(R.layout.row, parent, false) :
                convertView;

        //region Referencia a objetos graficos
        TextView tvTitulo = (TextView)convertView.findViewById(R.id.text_titulo);
        TextView tvIsbn = (TextView)convertView.findViewById(R.id.text_isbn);
        TextView tvFecha_publicacion = (TextView)convertView.findViewById(
                R.id.text_fechaPublicacion);
        ImageView ivLibro = (ImageView)convertView.findViewById(R.id.image_libro);

        tvTitulo.setText(libro.getTitulo());
        tvIsbn.setText(libro.getIsbn());
        tvFecha_publicacion.setText(libro.getFechaPublicacion());
        ivLibro.setImageResource(libro.getIdImagen());
        //endregion

        return convertView;
    }
    //endregion
}
