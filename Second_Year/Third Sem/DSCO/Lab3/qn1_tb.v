`timescale 1ns/1ps
`include "qn1.v"

module qn1_tb();

reg A,B,C,D;
wire f;

qn1 one(A,B,C,D,f);

initial
begin
    $dumpfile("qn1.vcd");
    $dumpvars(0,qn1_tb);

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

    #10
     $finish;
end

endmodule
