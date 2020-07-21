package com.example.aman_gusain.calculator_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aman_gusain.calculator_main.R;

public class MainActivity extends AppCompatActivity {
    TextView edt1,edt2,edt3,edt4;
    double  result_1;
    float result_2;
    float temp_1=0;
    float temp_3=0;
    float temp_2=0;
    float num1=0;
    int n_res;
    int a=0;
    float base=0;
    float temp_4=0;
    String s;
    long b=0;
    int pow1=0;
    int py=0;
    long msg=0;
    String numa;
    String si="";
    String bi="";
    long num=0;
    int f=0;
    ScrollView scv;
    int action=0,pnt=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,ac,equl,stop,clr,per,nw,nw1;
    Button b11,b21,b31,b41,b51,fact,b61,b71,b81,b91,b01,pi,sin,cos,tan,asin,acos,atan,equl1,sq,sqr,cub,cur,b1s,b11s,log,pow,ac1,clr1;
    LinearLayout lout1,lout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (TextView) findViewById(R.id.tv1);
        edt2 = (TextView) findViewById(R.id.tv2);
        edt3 = (TextView) findViewById(R.id.tv3);
        edt4=(TextView)findViewById(R.id.tv4);
        edt4.setVisibility(View.INVISIBLE);
        scv=(ScrollView)findViewById(R.id.scv);
        View lastchild=scv.getChildAt(scv.getChildCount()-1);
        int bottom=lastchild.getBottom()+scv.getPaddingBottom();
        int sy=scv.getScrollY();
        int sh=scv.getHeight();
        int delta=bottom-(sy+sh);
        scv.smoothScrollBy(0,scv.getHeight());
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 1;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "1");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "1");
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 2;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "2");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "2");
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }

                }
            }

        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 3;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "3");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "3");
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 4;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "4");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "4");
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }


            }
        });
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 5;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "5");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "5");
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 6;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "6");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "6");
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 7;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "7");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "7");
                            //num1 = Float.parseFloat(edt2.getText().toString());
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 8;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "8");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "8");
                            //num1 = Float.parseFloat(edt2.getText().toString());
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 9;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "9");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "9");
                            //num1 = Float.parseFloat(edt2.getText().toString());
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }
            }
        });

        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(action<=4) {
                    if (pnt == 0) {
                        num = (num * 10) + 0;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    } else {
                        if (action == 0) {
                            edt1.setText(edt1.getText() + "0");
                            num1 = Float.parseFloat(edt1.getText() + "");
                        } else {
                            edt2.setText(edt2.getText() + "0");
                            //num1 = Float.parseFloat(edt2.getText().toString());
                            numa = String.valueOf((edt2.getText()));
                            numa = numa.substring(2);
                            num1 = Float.parseFloat(numa.toString());
                        }
                    }
                }

            }
        });
                stop = (Button) findViewById(R.id.stop);
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(action<=4) {
                        if (pnt == 0) {
                            if (action == 0) {
                                edt1.setText(edt1.getText() + ".");
                                num1 = Float.parseFloat(edt1.getText() + "0");
                                pnt = 1;
                            } else {
                                if(num!=0) {
                                    edt2.setText(edt2.getText() + ".");
                                    numa = String.valueOf((edt2.getText()));
                                    numa = numa.substring(2);
                                    num1 = Float.parseFloat(numa.toString() + "0");
                                    pnt = 1;
                                }
                                else {
                                    edt2.setText(s +"0.");
                                    numa = String.valueOf((edt2.getText()));
                                    numa = numa.substring(2);
                                    num1 =Float.parseFloat(numa.toString());
                                    pnt = 1;
                                }
                            }
                        }

                    }
                }
            });
        clr=(Button)findViewById(R.id.clr);
        if(action==1) {
            numa = String.valueOf((edt2.getText()));
            numa = numa.substring(2);
        }

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                if(pnt==0) {
                    if (f != 1) {
                        num = num / 10;
                        if (action == 0) {
                            edt1.setText(String.valueOf(num));
                        } else {
                            edt2.setText(String.valueOf(s + num));
                        }
                    }
                }
                else {
                    if (f != 1) {

                        if (action == 0) {
                            numa = String.valueOf((edt1.getText()));
                            if (numa.length() > 1) {
                                numa = numa.substring(0, numa.length() - 1);
                                edt1.setText(String.valueOf(numa));
                                num1 = Float.parseFloat(0+numa.toString());
                                if (num1 == num) {
                                    pnt = 0;
                                }
                            } else {
                                num1 = 0;
                                edt1.setText(String.valueOf(""));

                            }
                        } else {

                            if (numa.length() > 1) {

                                numa = numa.substring(0, numa.length() - 1);
                                num1 = Float.parseFloat(numa.toString());
                                if (num1 == num) {
                                    pnt = 0;
                                }
                                edt2.setText(String.valueOf(s + numa));

                            } else {
                                num1 = 0;
                                edt1.setText(String.valueOf(""));

                            }
                        }
                    }
                }


            }
        });


        ac = (Button) findViewById(R.id.ac);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                temp_1=0;
                temp_2=0;
                num=0;
                num1=0;
                f=0;
                temp_3=0;
                pnt=0;
                action=0;
                b=0;
                edt1.setText(String.valueOf( ""));
                edt2.setText(String.valueOf( ""));
                edt3.setText(String.valueOf( ""));
                base=0;
                temp_4=0;
                si="";
                bi="";
                pow1=0;
                py=0;
                n_res=0;

            }
        });
        per=(Button)findViewById(R.id.per);
        per.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if ((action == 0||action==6)&&b==0) {
                        action=5;
                        b = 1;

                        if (pnt == 0) {
                            temp_1 = num;
                        } else {
                            temp_1 = num1;
                        }
                        edt2.setText(String.valueOf(" "));

                        if (f == 1) {
                            edt1.setText(String.valueOf(" "));
                            result_2 = temp_3 / 100;
                            num = 0;
                            num1 = 0;
                            edt3.setText(String.valueOf(result_2));
                            temp_3=result_2;
                        } else {

                            result_2 = temp_1 / 100;
                            edt3.setText(String.valueOf(result_2));
                            temp_3 = result_2;
                            num = 0;
                            num1 = 0;

                        }
                        f = 1;
                    }
                }

            });
        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                edt4.setVisibility(View.INVISIBLE);
                if (action == 0)
                {
                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action = 1;
                        num = 0;
                        edt2.setText(String.valueOf("+  "));
                        s = "+  ";
                        f=0;

                    } else {
                        if(pnt==0) {
                            temp_1 = num;
                        }
                        else
                        {
                            temp_1=num1;
                        }
                        pnt=0;
                        action = 1;
                        num = 0;
                        num1=0;
                        edt2.setText(String.valueOf("+  "));
                        s = "+  ";
                    }
            }
            else{
                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action = 1;
                        num=0;
                        f=0;
                        edt2.setText(String.valueOf("+  "));
                        s = "+  ";

                    } else {
                        action = 1;
                        num=0;
                        edt2.setText(String.valueOf("+  "));
                        s = "+  ";
                    }
                }


            }
        });
        sub = (Button) findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                edt4.setVisibility(View.INVISIBLE);

                if(action==0) {

                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action = 2;
                        num = 0;
                        f=0;
                        edt2.setText(String.valueOf("-  "));
                        s = "-  ";
                    } else {
                        if(pnt==0) {
                            temp_1 = num;
                        }
                        else
                        {
                            temp_1=num1;
                        }
                        pnt=0;
                        action = 2;
                        num = 0;
                        num1=0;
                        edt2.setText(String.valueOf("-  "));
                        s = "-  ";
                    }
                }
                else {
                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action = 2;
                        f=0;
                        num=0;
                        edt2.setText(String.valueOf("-  "));
                        s = "-  ";
                    } else {
                        action = 2;
                        num=0;
                        edt2.setText(String.valueOf("-  "));
                        s = "-  ";
                    }

                }

            }
        });
        mul = (Button) findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                edt4.setVisibility(View.INVISIBLE);

                if(action==0) {
                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action =3;
                        num = 0;
                        f=0;
                        edt2.setText(String.valueOf("×  "));
                        s = "×  ";
                    } else {
                        action =3;
                        if(pnt==0) {
                            temp_1 = num;
                        }
                        else
                        {
                            temp_1=num1;
                        }
                        pnt=0;
                        num = 0;
                        num1=0;
                        edt2.setText(String.valueOf("×  "));
                        s = "×  ";
                    }
                }
                else {
                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action =3;
                        num=0;
                        f=0;
                        edt2.setText(String.valueOf("×  "));
                        s = "×  ";
                    } else {
                        action =3;
                        num = 0;
                        edt2.setText(String.valueOf("×  "));
                        s = "×  ";
                    }
                }
            }
        });
        div= (Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                edt4.setVisibility(View.INVISIBLE);
                if(action==0) {

                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action = 4;
                        num = 0;
                        f=0;
                        edt2.setText(String.valueOf("÷  "));
                        s = "÷  ";
                    } else {
                        action = 4;
                        if(pnt==0) {
                            temp_1 = num;
                        }
                        else
                        {
                            temp_1=num1;
                        }
                        num = 0;
                        num1=0;
                        pnt=0;
                        edt2.setText(String.valueOf("÷  "));
                        s = "÷  ";
                    }
                }
                else {
                    if (f == 1) {
                        n_res=(int)temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText(String.valueOf((int)temp_3));
                        }
                        else
                        {
                            edt1.setText(String.valueOf(temp_3));
                        }
                        edt3.setText(String.valueOf(" "));
                        temp_1 = temp_3;
                        action = 4;
                        num=0;
                        f=0;
                        edt2.setText(String.valueOf("÷  "));
                        s = "÷  ";
                    } else {
                        action = 4;
                        num=0;
                        edt2.setText(String.valueOf("÷  "));
                        s = "÷  ";
                    }
                }
            }
        });
        equl = (Button) findViewById(R.id.equl);
        equl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a==0) {
                    edt4.setVisibility(View.VISIBLE);
                    a = 1;
                    if (action != 0) {
                        if (pnt == 0) {
                            temp_2 = num;
                        } else {
                            temp_2 = num1;
                        }
                        num = 0;
                        num1 = 0;
                        switch (action) {
                            case 1:
                                result_1 = temp_1 + temp_2;
                                break;
                            case 2:
                                result_1 = temp_1 - temp_2;
                                break;
                            case 3:
                                result_1 = temp_1 * temp_2;
                                break;
                            case 4:
                                if(temp_2!=0) {
                                    result_1 = temp_1 / temp_2;
                                }
                                else {
                                    msg=1;
                                }
                                break;
                            case 5:
                                result_1=result_2;
                                break;


                        }
                        if(msg!=1) {
                            n_res=(int)result_1;
                            if(n_res==result_1) {
                                edt3.setText(String.valueOf("= " + (int) result_1));
                            }
                            else {
                                edt3.setText(String.valueOf("= " + (float) result_1));
                            }
                            temp_2 = 0;
                            temp_3 = (float) result_1;
                            result_2 = 0;
                            result_1 = 0;
                            f = 1;
                            action = 6;
                            num=0;
                            num1=0;
                            pnt=0;
                            n_res=0;
                        }
                        else {
                            Toast.makeText(MainActivity.this,"INVALID INPUT",Toast.LENGTH_SHORT).show();
                            a=0;
                            edt4.setVisibility(View.INVISIBLE);
                            temp_1=0;
                            temp_2=0;
                            num=0;
                            f=0;
                            temp_3=0;
                            pnt=0;
                            action=0;
                            b=0;
                            msg=0;
                            pnt=0;
                            edt1.setText(String.valueOf( " "));
                            edt2.setText(String.valueOf( " "));
                            edt3.setText(String.valueOf( " "));
                        }

                    } else {
                        action=6;
                        if (pnt == 0) {
                            result_1=num;
                            edt3.setText(String.valueOf(" = " + num));
                        } else {
                            result_1=num1;
                            edt3.setText(String.valueOf(" = " + num1));
                        }
                        temp_2 = 0;
                        temp_3 = (float) result_1;
                        result_2 = 0;
                        result_1 = 0;
                        f = 1;
                        num=0;
                        num1=0;
                        pnt=0;
                    }


                }
                scv.scrollTo(0,798);
            }
        });



















        lout1=(LinearLayout) findViewById(R.id.lout1);
        lout2=(LinearLayout) findViewById(R.id.lout2);

        nw=(Button)findViewById(R.id.nw);
        nw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation in=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                in.setDuration(500);
                if(temp_1==0)
                {
                    edt1.setText("");
                    num=0;
                    num1=0;
                }
                n_res=0;
                lout1.setVisibility(View.INVISIBLE);
                lout2.setVisibility(View.VISIBLE);
                lout2.setAnimation(in);
                action=0;
            }
        });
        nw1=(Button)findViewById(R.id.nw1);
        nw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation in=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                in.setDuration(500);
                n_res=0;
                if(temp_4==0)
                {
                    edt1.setText("");
                    num=0;
                    num1=0;
                }
                lout2.setVisibility(View.INVISIBLE);
                lout1.setVisibility(View.VISIBLE);
                lout1.setAnimation(in);
                action=0;
            }
        });
        b11 = (Button) findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 1;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });
        b21= (Button) findViewById(R.id.b21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 2;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }

        });
        b31 = (Button) findViewById(R.id.b31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 3;
                    edt1.setText(String.valueOf(si + num+bi));
                }

            }
        });
        b41 = (Button) findViewById(R.id.b41);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 4;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });
        b51 = (Button) findViewById(R.id.b51);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 5;
                    edt1.setText(String.valueOf(si + num+bi));
                }

            }
        });
        b61 = (Button) findViewById(R.id.b61);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 6;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });
        b71 = (Button) findViewById(R.id.b71);
        b71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 7;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });
        b81 = (Button) findViewById(R.id.b81);
        b81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 8;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });
        b91 = (Button) findViewById(R.id.b91);
        b91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 9;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });

        b01 = (Button) findViewById(R.id.b01);
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((f==0||pow1==1)&&py==0) {
                    num = (num * 10) + 0;
                    edt1.setText(String.valueOf(si + num+bi));
                }
            }
        });
        pi=(Button)findViewById(R.id.pi);
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                if(f==0) {
                    if (num == 0) {
                        num1 = (float) Math.PI;
                        edt1.setText(String.valueOf(si +"π"+bi));
                    } else {
                        num1 = (float) (num * Math.PI);
                        edt1.setText(String.valueOf(si +num+"π"+bi));
                    }
                }
                pnt=1;
                py=1;
            }
        });

        sin=(Button)findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                if(f==0) {
                    edt1.setText("sin(" + num);
                    si = "sin(";
                }
                else
                {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("sin(" + (int)temp_3 + "°" + ")");
                    }
                    else {
                        edt1.setText("sin(" + temp_3 + "°" + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=1;
            }
        });
        cos=(Button)findViewById(R.id.cos);
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                if(f==0) {
                    edt1.setText("cos(" + num);
                    si = "cos(";
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("cos(" + (int)temp_3+ "°"  + ")");
                    }
                    else {
                        edt1.setText("cos(" + temp_3 + "°" + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=2;
            }
        });
        tan=(Button)findViewById(R.id.tan);
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                if(f==0) {
                    edt1.setText("tan(" + num);
                    si = "tan(";
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("tan(" +(int) temp_3 + "°" + ")");
                    }
                    else {
                        edt1.setText("tan(" + temp_3+ "°" + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=3;
            }
        });
        asin=(Button)findViewById(R.id.sin1);
        asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                if(f==0) {
                    edt1.setText("sin⁻¹("+num);
                    si = "sin⁻¹(";
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("sin⁻¹(" +(int) temp_3 + ")");
                    }
                    else {
                        edt1.setText("sin⁻¹(" + temp_3 + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=4;
            }
        });
        acos=(Button)findViewById(R.id.cos1);
        acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                if(f==0) {
                    edt1.setText("cos⁻¹("+num);
                    si = "cos⁻¹(";
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("cos⁻¹(" +(int) temp_3 + ")");
                    }
                    else {
                        edt1.setText("cos⁻¹(" + temp_3 + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=5;
            }
        });
        atan=(Button)findViewById(R.id.tan1);
        atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                if(f==0) {
                    edt1.setText("tan⁻¹("+num);
                    si = "tan⁻¹(";
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("tan⁻¹(" + (int)temp_3 + ")");
                    }
                    else {
                        edt1.setText("tan⁻¹(" + temp_3 + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=6;
            }
        });
        sq=(Button)findViewById(R.id.sq);
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                si= "";

                if(f==0)
                {
                    if(pnt==0) {
                        edt1.setText(num + "²");
                        bi = "²";
                    }
                    else {
                        edt1.setText(num1 + "²");
                        bi = "²";
                    }
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    num1=temp_3;
                    n_res= (int) num1;
                    if(n_res==temp_3)
                    {
                        edt1.setText((int)num1 + "²");
                    }
                    else {
                        edt1.setText(num1 + "²");
                    }
                    pnt=1;
                }
                action=7;
            }
        });
        cub=(Button)findViewById(R.id.cub);
        cub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                si= "";

                if(f==0)
                {
                    if(pnt==0) {
                        edt1.setText(num + "³");
                        bi = "³";
                    }
                    else {
                    edt1.setText(num1 + "³");
                    bi = "³";
                }
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    num1=temp_3;
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText((int)num1 + "³");
                    }
                    else {
                        edt1.setText(num1 + "³");
                    }
                    pnt=1;
                }
                action=8;

            }
        });
        sqr=(Button)findViewById(R.id.sqr);
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi= "";

                if(f==0)
                {
                    if(pnt==0) {
                        edt1.setText("√" + num);
                        si = "√";
                    }
                    else {
                    edt1.setText( "√"+num1);
                    si = "√";
                }
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    num1=temp_3;
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("√" +(int) num1);
                    }
                    else {
                        edt1.setText("√" + num1);
                    }
                    pnt=1;
                }
                action=9;
            }
        });
        cur=(Button)findViewById(R.id.cur);
        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                bi= "";

                if(f==0)
                {
                    if(pnt==0) {
                        edt1.setText("∛" + num);
                        si = "∛";
                    }
                    else {
                    edt1.setText("∛"+num1);
                    si = "∛";
                }
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    num1=temp_3;
                    n_res= (int) temp_3;
                    if( n_res==temp_3)
                    {
                        edt1.setText("∛" +(int) num1);
                    }
                    else {
                        edt1.setText("∛" + num1);
                    }
                    pnt=1;
                }
                action=10;
            }
        });
        b1s=(Button)findViewById(R.id.b1s);
        b1s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt4.setVisibility(View.INVISIBLE);
                bi= "";
                a=0;
                if(f==0)
                {
                    if(pnt==0) {
                        edt1.setText("1/" + num);
                        si = "1/";
                    }
                    else {
                    edt1.setText( "1/"+num1 );
                    si = "1/";
                    }
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    num1=temp_3;
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("1/" +(int) num1);
                    }
                    else {
                        edt1.setText("1/" + num1);
                    }
                    pnt=1;
                }
                action=11;
            }

        });
        b11s=(Button)findViewById(R.id.b11s);
        b11s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt4.setVisibility(View.INVISIBLE);
                a=0;
                if(f==0)
                {
                    if(pnt==0) {
                        edt1.setText("1/" + num + "²");
                        si = "1/";
                        bi = "²";
                    }
                    else {
                        edt1.setText("1/" + num1 + "²");
                        si = "1/";
                        bi = "²";
                }
                }
                else {
                    edt2.setText("");
                    edt3.setText("");
                    num1=temp_3;
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("1/" +(int) num1 + "²");
                    }
                    else {
                        edt1.setText("1/" + num1 + "²");
                    }
                    pnt=1;
                }
                action=12;
            }

        });

            fact = (Button) findViewById(R.id.fact);
            fact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    edt4.setVisibility(View.INVISIBLE);
                    if(f==0&&py==0) {
                            si = "";
                            edt1.setText(num + "!");
                            bi = "!";
                            action = 13;

                    }

                }
            });
        log=(Button)findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt4.setVisibility(View.INVISIBLE);
                bi="";
                a=0;
                if(f==0) {
                    edt1.setText("log(" + num);
                    si = "log(";
                }
                else
                {
                    edt2.setText("");
                    edt3.setText("");
                    n_res= (int) temp_3;
                    if(n_res==temp_3)
                    {
                        edt1.setText("log(" +(int) temp_3 + ")");
                    }
                    else {
                        edt1.setText("log(" + temp_3 + ")");
                    }
                    num1=temp_3;
                    pnt=1;
                }
                action=14;

            }
        });
        pow=(Button)findViewById(R.id.pow);
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt4.setVisibility(View.INVISIBLE);
                a=0;
                if(py==0) {
                    if (f == 0) {
                        bi = "";
                        if (num != 0) {
                            edt1.setText(num + "^");
                            base = num;
                            si = String.valueOf(num + "^");
                            num = 0;
                        }

                    } else {
                        edt2.setText("");
                        edt3.setText("");
                        n_res= (int) temp_3;
                        if(n_res==temp_3)
                        {
                            edt1.setText((int) temp_3 + "^");
                        }
                        else {
                            edt1.setText(temp_3 + "^");
                        }
                        base = (float) temp_3;
                        if(n_res==temp_3)
                        {
                            si = String.valueOf((int) temp_3 + "^");
                        }
                        else {
                            si = String.valueOf(temp_3 + "^");
                        }

                    }
                    action = 15;
                    pow1 = 1;
                }
            }
        });

        equl1=(Button)findViewById(R.id.equl1);
        equl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a==0) {
                    edt4.setVisibility(View.VISIBLE);
                    a = 1;
                    si="";
                    if (action != 0) {
                        if (pnt == 0||pow1==1) {
                            temp_4 = num;
                            num = 0;
                        }
                        else {
                            temp_4 = num1;
                            num1 = 0;
                        }
                        pow1 = 0;
                        switch (action) {
                            case 1:
                                if(py==1) {
                                    temp_4 = (float) Math.toDegrees(temp_4);
                                }
                                if(temp_4==180||temp_4==360||temp_4==540||temp_4==720)
                                {
                                    n_res= (int) temp_4;
                                    if(n_res==temp_4)
                                    {
                                        edt1.setText("sin(" +(int) temp_4 + "°" + ")");
                                    }
                                    else {
                                        edt1.setText("sin(" + temp_4 + "°" + ")");
                                    }
                                    result_1=0;
                                }
                                else {
                                    if (py == 0) {
                                        n_res= (int) temp_4;
                                        if(n_res==temp_4)
                                        {
                                            edt1.setText("sin(" +(int) temp_4 + "°" + ")");
                                        }
                                        else {
                                            edt1.setText("sin(" + temp_4 + "°" + ")");
                                        }
                                        temp_4 = (float) Math.toRadians(temp_4);
                                    } else {
                                        edt1.setText("sin(" + (int)temp_4 + "°" + ")");
                                        temp_4 = (float) Math.toRadians(temp_4);
                                    }
                                    result_1 = (float) Math.sin(temp_4);
                                }
                                break;
                            case 2:
                                if(py==1)
                                {
                                    temp_4 = (float) Math.toDegrees(temp_4);
                                }
                                if(temp_4==90||temp_4==270||temp_4==450||temp_4==630)
                                {
                                    n_res= (int) temp_4;
                                    if(n_res==temp_4)
                                    {
                                        edt1.setText("cos(" +(int) temp_4 + "°" + ")");
                                    }
                                    else {
                                        edt1.setText("cos(" + temp_4 + "°" + ")");
                                    }
                                    result_1=0;
                                }
                                else {
                                    if (py == 0) {
                                        n_res= (int) temp_4;
                                        if(temp_4==n_res)
                                        {
                                            edt1.setText("cos(" +(int) temp_4 + "°" + ")");
                                        }
                                        else {
                                            edt1.setText("cos(" + temp_4 + "°" + ")");
                                        }
                                        temp_4 = (float) Math.toRadians(temp_4);
                                    } else {
                                        edt1.setText("cos(" + (int)temp_4 + "°" + ")");
                                        temp_4 = (float) Math.toRadians(temp_4);
                                    }
                                    result_1 = (float) Math.cos(temp_4);
                                }
                                break;
                            case 3:
                                if(py==1)
                                {
                                    temp_4 = (float) Math.toDegrees(temp_4);
                                }
                                if(temp_4==90||temp_4==270||temp_4==450||temp_4==630)
                                {
                                    n_res= (int) temp_4;
                                    if(n_res==temp_4)
                                    {
                                        edt1.setText("tan(" +(int) temp_4 + "°" + ")");
                                    }
                                    else {
                                        edt1.setText("tan(" + temp_4 + "°" + ")");
                                    }
                                    result_1=Double.POSITIVE_INFINITY;
                                }
                                else if(temp_4==180||temp_4==360||temp_4==540||temp_4==720)
                                {
                                    n_res= (int) temp_4;
                                    if(n_res==temp_4)
                                    {
                                        edt1.setText("tan(" +(int) temp_4 + "°" + ")");
                                    }
                                    else {
                                        edt1.setText("tan(" + temp_4 + "°" + ")");
                                    }
                                    result_1=0;
                                }
                                else {

                                    if (py == 0) {
                                        n_res= (int) temp_4;
                                        if(n_res==temp_4)
                                        {
                                            edt1.setText("tan(" +(int) temp_4 + "°" + ")");
                                        }
                                        else {
                                            edt1.setText("tan(" + temp_4 + "°" + ")");
                                        }
                                        temp_4 = (float) Math.toRadians(temp_4);
                                    } else {
                                        edt1.setText("tan(" + (int) Math.toDegrees(temp_4) + "°" + ")");
                                    }
                                    result_1 = (float) Math.tan(temp_4);
                                }
                                break;
                            case 4:
                                si="°";
                                n_res= (int) temp_4;
                                if(n_res==temp_4)
                                {
                                    edt1.setText("sin⁻¹(" +(int) temp_4 + ")");
                                }
                                else {
                                    edt1.setText("sin⁻¹(" + temp_4 + ")");
                                }
                                result_1 = (float) Math.asin(temp_4);
                                result_1 = (float) Math.toDegrees(result_1);
                                break;
                            case 5:
                                si="°";
                                n_res= (int) temp_4;
                                if(n_res==temp_4)
                                {
                                    edt1.setText("cos⁻¹(" +(int) temp_4 + ")");
                                }
                                else {
                                    edt1.setText("cos⁻¹(" + temp_4 + ")");
                                }
                                result_1 = (float) Math.acos(temp_4);
                                result_1 = (float) Math.toDegrees(result_1);
                                break;
                            case 6:
                                si="°";
                                n_res= (int) temp_4;
                                if(n_res==temp_4)
                                {
                                    edt1.setText("tan⁻¹(" +(int) temp_4 + ")");
                                }
                                else {
                                    edt1.setText("tan⁻¹(" + temp_4 + ")");
                                }
                                result_1 = (float) Math.atan(temp_4);
                                result_1 = (float) Math.toDegrees(result_1);
                                break;
                            case 7:
                                result_1 = temp_4 * temp_4;
                                break;
                            case 8:
                                result_1 = temp_4 * temp_4 * temp_4;
                                break;
                            case 9:
                                result_1 = (float) Math.sqrt(temp_4);
                                break;
                            case 10:
                                result_1 = (float) Math.cbrt(temp_4);
                                break;
                            case 11:
                                result_1 = 1 / temp_4;
                                break;
                            case 12:
                                result_1 = 1 / (temp_4 * temp_4);
                                break;
                            case 13:
                                int i;
                                double j = 1;
                                for (i = 1; i <= temp_4; i++) {
                                    j = j * i;
                                }
                                result_1 = j;
                                break;
                            case 14:
                                n_res= (int) temp_4;
                                if(n_res==temp_4)
                                {
                                    edt1.setText("log(" +(int) temp_4 + ")");
                                }
                                else
                                {
                                edt1.setText("log(" + temp_4 + ")");
                                }
                                result_1 = Math.log10(temp_4);
                                break;
                            case 15:
                                n_res= (int) base;
                                if(n_res==base)
                                {
                                    edt1.setText((int) base + "^" + (int) temp_4);
                                }
                                else {
                                    edt1.setText(base + "^" + (int) temp_4);
                                }
                                result_1 = Math.pow(base, temp_4);
                                base = 0;
                                break;


                        }
                        py = 0;
                        pnt=0;
                        n_res=0;
                        String ans = String.valueOf(result_1);
                        if (ans.length() > 8) {
                            edt3.setTextSize(55);
                        } else {
                            edt3.setTextSize(65);
                        }
                        if (action == 13) {
                            n_res= (int) result_1;
                            if(n_res==result_1)
                            {
                                edt3.setText(String.valueOf("=  " +(int) result_1+si));
                            }
                            else {
                                edt3.setText(String.valueOf("=  " + result_1+si));
                            }
                        } else {
                            n_res= (int) result_1;
                            if(n_res==result_1)
                            {
                                edt3.setText(String.valueOf("=  " +(int) result_1+si));
                            }
                            else {
                                edt3.setText(String.valueOf("=  " + (float) result_1+si));
                            }

                        }
                        temp_3 = (float) result_1;
                        result_2 = 0;
                        result_1 = 0;
                        f = 1;
                        si = "";
                        bi = "";
                    } else {
                        py=0;
                        if (pnt == 0) {
                            result_1 = num;
                        } else {
                            result_1 = num1;
                        }
                        String ans = String.valueOf(result_1);
                        if (ans.length() > 8) {
                            edt3.setTextSize(55);
                        } else {
                            edt3.setTextSize(65);
                        }
                        n_res= (int) result_1;
                        if(n_res==result_1)
                        {
                            edt3.setText(String.valueOf("=  " +(int) result_1));
                        }
                        else {
                            edt3.setText(String.valueOf("=  " + (float) result_1));
                        }
                        temp_3 = (float) result_1;
                        result_2 = 0;
                        result_1 = 0;
                        num = 0;
                        num1 = 0;
                        f = 1;
                        si = "";
                        bi = "";
                        pnt=0;

                    }

                }
                n_res=0;
                }


        });
        ac1 = (Button) findViewById(R.id.ac1);
        ac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                edt4.setVisibility(View.INVISIBLE);
                temp_1=0;
                temp_2=0;
                num=0;
                num1=0;
                f=0;
                temp_3=0;
                pnt=0;
                action=0;
                b=0;
                edt1.setText(String.valueOf( ""));
                edt2.setText(String.valueOf( ""));
                edt3.setText(String.valueOf( ""));
                base=0;
                temp_4=0;
                si="";
                bi="";
                pow1=0;
                py=0;
                n_res=0;

            }
        });
        clr1=(Button) findViewById(R.id.clr1);
        clr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f==0&&py==0) {
                    num = (int) (num / 10);
                    edt1.setText(String.valueOf(num));
                    action=0;
                    si="";
                    bi="";
                }
            }
        });

    }
}

