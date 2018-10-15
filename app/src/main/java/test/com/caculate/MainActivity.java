package test.com.caculate;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    public TextView nums;
    public Button clear;
    public Button devide;
    public Button multiply;
    public Button delete;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button reduce;
    public Button four;
    public Button five;
    public Button six;
    public Button plus;
    public Button one;
    public Button two;
    public Button three;
    public Button percent;
    public Button zero;
    public Button dot;
    public Button equal;


    private float beforeNum = -1;
    private String TYPE_PLUS = "plus";
    private String TYPE_REDUCE = "reduce";
    private String TYPE_MULTIPLY = "multiply";
    private String TYPE_DIVIDE = "divide";
    private String TYPE_DEFALU = "default";

    private String currentType = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        nums = findViewById (R.id.nums);
        clear = findViewById (R.id.clear);
        devide = findViewById (R.id.devide);
        multiply = findViewById (R.id.multiply);
        delete = findViewById (R.id.delete);
        seven = findViewById (R.id.seven);
        eight = findViewById (R.id.eight);
        nine = findViewById (R.id.nine);
        reduce = findViewById (R.id.reduce);
        four = findViewById (R.id.four);
        five = findViewById (R.id.five);
        six = findViewById (R.id.six);
        plus = findViewById (R.id.plus);
        one = findViewById (R.id.one);
        two = findViewById (R.id.two);
        three = findViewById (R.id.three);
        percent = findViewById (R.id.percent);
        zero = findViewById (R.id.zero);
        dot = findViewById (R.id.dot);
        equal = findViewById (R.id.equal);

        clear.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                nums.setText ("");
            }
        });
        devide.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String content = nums.getText ().toString ();
                currentType = TYPE_DIVIDE;
//                try {
//                    nums.
//                } catch ()
            }
        }); multiply.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

            }
        });
        delete.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                deleteOne ();
            }
        });
        seven.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (7);

            }
        });
        eight.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (8);
            }
        });
        nine.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (9);
            }
        });
        reduce.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

            }
        });
        four.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (4);
            }
        });
        five.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (5);
            }
        });
        six.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (6);
            }
        });
        plus.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

            }
        });
        one.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (1);
            }
        });
        two.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (2);
            }
        });
        three.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (3);
            }
        });
        percent.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addPercent ();
            }
        });
        zero.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addNums (0);
            }
        });
        dot.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                addDot ();
            }
        });
        equal.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String content = nums.getText ().toString ();
            }
        });


    }

    public void addDot() {
        String content = nums.getText ().toString ();
        if (!content.contains (".")) {
            nums.setText (nums + ".");
        }
    }

    public void addPercent() {
        String content = nums.getText ().toString ();
        if (!content.contains ("%")) {
            nums.setText (nums + "%");
        }
    }

    public void addNums(int num) {
        String content = nums.getText ().toString ();
        if (content.equals (0)) {
            nums.setText (num + 0);
        }
        nums.setText (content + nums);
    }

    public void deleteOne() {
        String content = nums.getText ().toString ();
        if (!content.equals (0) && nums.length () > 0) {
            content = content.substring (0, content.length () - 1);
        }
    }

    public float devide(float beforeNum, float lastNum) {
        String content = nums.getText ().toString ();
        return beforeNum / lastNum;
    }

    public float multiply(float beforeNum, float lastNum) {
        String content = nums.getText ().toString ();
        return beforeNum * lastNum;
    }

    public float reduce(float beforeNum, float lastNum) {
        String content = nums.getText ().toString ();
        return beforeNum - lastNum;
    }

    public float plus(float beforeNum, float lastNum) {
        String content = nums.getText ().toString ();
        return beforeNum + lastNum;
    }


}
