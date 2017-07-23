package com.example.user.ca_simulation;


import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.AdapterView.OnItemClickListener;

//import org.ros.cafe_Boss_Emp.app.R;

//import static com.example.user.ca_simulation.R.id.table_screen_return;
//import android.widget.ActionMenuView.*;
/**
  Created by user on 2017-07-02.
 */

public class OrderedContentActivity  extends TableActivity{  // extends AppCompactActivity

    private ArrayList<TableModel> menuList;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordered_content);

        menuList = new ArrayList<>();
        ListView view = (ListView) findViewById(R.id.listView);
        tablelistviewAdapter adapter = new tablelistviewAdapter(this, menuList);
        view.setAdapter(adapter);

        populateList();
        adapter.notifyDataSetChanged();
        view.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String tableNo = ((TextView) view.findViewById(R.id.tableNo)).getText().toString();
                String menu = ((TextView) view.findViewById(R.id.menu)).getText().toString();
                String size = ((TextView) view.findViewById(R.id.size)).getText().toString();
                String count = ((TextView) view.findViewById(R.id.count)).getText().toString();

                Toast.makeText(getApplicationContext(),
                        "Table_Number : " + tableNo + "\n"
                                + "Menu : " + menu + "\n"
                                + "Size : " + size + "\n"
                                + "Count : " + count, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void populateList() {

        TableModel item1, item2, item3;

        item1 = new TableModel("\t\t\t\t1 ", "    Esspresso", "\t\t\t\t\t\t\tX", "\t\t\t\t2");
        menuList.add(item1);
        item2 = new TableModel("\t\t\t\t5 ", "    Americano", "\t\t\t\t\t\t\tL", "\t\t\t\t1");
        menuList.add(item2);
        item3 = new TableModel("\t\t\t\t2 ", "    Hot Chocolate", "\t\t\t\t\t\t\tXL", "\t\t\t\t3");
        menuList.add(item3);
    }
    // Inflate Menu icons

    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu, this adds items to the actionbar
        getMenuInflater().inflate(R.menu.menu_ordered_content, menu);
        return true;
    }

 /*   @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == table_screen_return){
            Intent intent = new Intent(getApplication(), TableActivity.class);
            count++;
            startActivity(intent);
            count=1;
        }
        return super.onOptionsItemSelected(item);
    }
    */
}
