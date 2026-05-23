module adder_subtractor(
    input [3:0] a,
    input [3:0] b,
    input mode,
    output [3:0] result,
    output carry
);

wire [3:0] b_comp;

assign b_comp = mode ? ~b : b;

assign {carry, result} = a + b_comp + mode;

endmodule
