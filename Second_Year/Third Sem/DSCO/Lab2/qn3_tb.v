`timescale 1ns/1ps
`include "qn3.v"

module qn3_tb();

reg x1,x2,x3,x4;
wire f;

qn3 three(x1,x2,x3,x4,f);

initial
begin
    $dumpfile("qn3.vcd");
    $dumpvars(0,qn3_tb);

    x1=0;x2=0;x3=0;x4=0;
    #10 x1=0;x2=0;x3=0;x4=1;
    #10 x1=0;x2=0;x3=1;x4=0;
    #10 x1=0;x2=0;x3=1;x4=1;

    #10 x1=0;x2=1;x3=0;x4=0;
    #10 x1=0;x2=1;x3=0;x4=1;
    #10 x1=0;x2=1;x3=1;x4=0;
    #10 x1=0;x2=1;x3=1;x4=1;

    #10 x1=1;x2=0;x3=0;x4=0;
    #10 x1=1;x2=0;x3=0;x4=1;
    #10 x1=1;x2=0;x3=1;x4=0;
    #10 x1=1;x2=0;x3=1;x4=1;

    #10 x1=1;x2=1;x3=0;x4=0;
    #10 x1=1;x2=1;x3=0;x4=1;
    #10 x1=1;x2=1;x3=1;x4=0;
    #10 x1=1;x2=1;x3=1;x4=1;

    #10 $finish;
end

initial
begin
    $monitor("x1=%b x2=%b x3=%b x4=%b f=%b",x1,x2,x3,x4,f);
end

endmodule
