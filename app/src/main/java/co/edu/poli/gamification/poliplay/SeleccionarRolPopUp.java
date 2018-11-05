package co.edu.poli.gamification.poliplay;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

public class SeleccionarRolPopUp extends Activity {

    private ImageView rol;
    private String rolSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_rol_pop_up);

        rol = (ImageView)findViewById(R.id.rolPrin);
        rolSelected = Login.user.getRole().toString();

        //EscalarPantalla
        DisplayMetrics md = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(md);
        int width = md.widthPixels;
        int heigth = md.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));

        escogerRolPop();
    }

    public void escogerRolPop() {
        if (Login.user.getSignature().equals("Proceso Administrativo")) {
            if (rolSelected.equals("Rol 1"))    {
                rol.setImageDrawable(getDrawable(R.drawable.h_explorador));
            }
            else if (rolSelected.equals("Rol 1f"))    {
                rol.setImageDrawable(getDrawable(R.drawable.m_explorador));
            }
            else if (rolSelected.equals("Rol 2")) {
                rol.setImageDrawable(getDrawable(R.drawable.h_filantropo));
            }
            else if (rolSelected.equals("Rol 2f")) {
                rol.setImageDrawable(getDrawable(R.drawable.m_filantropa));
            }
            else if (rolSelected.equals("Rol 3")) {
                rol.setImageDrawable(getDrawable(R.drawable.h_triunfador));
            }
            else if (rolSelected.equals("Rol 3f")) {
                rol.setImageDrawable(getDrawable(R.drawable.m_triunfadora));
            }
            else if (rolSelected.equals("Rol 4")) {
                rol.setImageDrawable(getDrawable(R.drawable.h_pensador));
            }
            else if (rolSelected.equals("Rol 4f")) {
                rol.setImageDrawable(getDrawable(R.drawable.m_pensadora));
            }
            else if (rolSelected.equals("Rol 5")) {
                rol.setImageDrawable(getDrawable(R.drawable.h_revolucionario));
            }
            else if (rolSelected.equals("Rol 5f")) {
                rol.setImageDrawable(getDrawable(R.drawable.m_revolucionaria));
            }
            else if(rolSelected.equals("Rol 6")){
                rol.setImageDrawable(getDrawable(R.drawable.h_socializador));
            }
            else if(rolSelected.equals("Rol 6f")){
                rol.setImageDrawable(getDrawable(R.drawable.m_socializador));
            }
        }
        else if (Login.user.getSignature().equals("Cultura Ambiental")) {
            if (rolSelected.equals("Rol 1")) {
                rol.setImageDrawable(getDrawable(R.drawable.coati));
            }
            else if (rolSelected.equals("Rol 2")) {
                rol.setImageDrawable(getDrawable(R.drawable.tucan));
            }
            else if (rolSelected.equals("Rol 3")) {
                rol.setImageDrawable(getDrawable(R.drawable.aguila));
            }
            else if (rolSelected.equals("Rol 4")) {
                rol.setImageDrawable(getDrawable(R.drawable.carpintero));
            }
            else if (rolSelected.equals("Rol 5")) {
                rol.setImageDrawable(getDrawable(R.drawable.tingua));
            }
            else{
                rol.setImageDrawable(getDrawable(R.drawable.rana));
            }
        }
    }

    public void btnSelRol(View view) {
        Intent i = new Intent(this, SeleccionarTransporte.class);
        startActivity(i);
    }
}
