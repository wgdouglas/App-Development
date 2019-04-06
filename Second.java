public class Second extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner3);


                ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Second.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);//Allows the adapter to show the data in the spinner
    }
}
