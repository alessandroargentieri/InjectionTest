package mawashi.alex.injectiontest.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import mawashi.alex.injectiontest.Injector.Injector;
import mawashi.alex.injectiontest.Model.Computer;
import mawashi.alex.injectiontest.R;

public class MainActivity extends AppCompatActivity {

    Computer pc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pc = Injector.injectComputer();
        Toast.makeText(this, pc.getFeatures(), Toast.LENGTH_LONG).show();
    }
}
