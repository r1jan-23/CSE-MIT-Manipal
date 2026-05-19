`timescale 1ns/1ps
`include "qn3.v"

module qn3_tb();

reg A,B,C,D;
wire f;

qn3 three(A,B,C,D,f);

initial
begin
    $dumpfile("qn3.vcd");
    $dumpvars(0,qn3_tb);

    A=0;B=0;C=0;D=0;
    #10 A=0;B=0;C=0;D=1;
    #10 A=0;B=0;C=1;D=0;
    #10 A=0;B=0;C=1;D=1;

    #10 A=0;B=1;C=0;D=0;
    #10 A=0;B=1;C=0;D=1;
    #10 A=0;B=1;C=1;D=0;
    #10 A=0;B=1;C=1;D=1;

    #10 A=1;B=0;C=0;D=0;
    #10 A=1;B=0;C=0;D=1;
    #10 A=1;B=0;C=1;D=0;
    #10 A=1;B=0;C=1;D=1;

    #10 A=1;B=1;C=0;D=0;
    #10 A=1;B=1;C=0;D=1;
    #10 A=1;B=1;C=1;D=0;
    #10 A=1;B=1;C=1;D=1;

    #10 $finish;
end

endmodule
