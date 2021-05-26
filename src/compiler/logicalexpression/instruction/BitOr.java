package compiler.logicalexpression.instruction;

import java.io.OutputStreamWriter;

import compiler.ExecutionEnvIntf;
import compiler.InstrIntf;

public class BitOr implements InstrIntf {

    /**
     * execute this instruction
     *
     * @param env
     */
    @Override
    public void execute(ExecutionEnvIntf env) {
        // pop operand 1 from value stack
        int op1 = env.popNumber();
        // pop operand 0 from value stack
        int op0 = env.popNumber();
        // execute BitWiseOr
        env.pushNumber(op0 | op1);
    }

    /**
     * trace this instruction
     *
     * @param os
     */
    @Override
    public void trace(OutputStreamWriter os) throws Exception {
        os.write("BITOR\n");
    }
}
