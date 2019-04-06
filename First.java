 public Button akabut1;

    public void init(){
        akabut1 = (Button) findViewById(R.id.akabut1);//setting the button up

        akabut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(First.this,Second.class);

                startActivity(toy);
            }
        });




    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        init();



    }
}
