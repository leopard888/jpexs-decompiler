/*
 *  Copyright (C) 2010-2015 JPEXS, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.abc.avm2.instructions.localregs;

import com.jpexs.decompiler.flash.abc.avm2.AVM2ConstantPool;
import com.jpexs.decompiler.flash.abc.avm2.LocalDataArea;
import com.jpexs.decompiler.flash.abc.avm2.instructions.AVM2Instruction;
import java.util.List;

public class GetLocal3Ins extends GetLocalTypeIns {

    public GetLocal3Ins() {
        super(0xd3, "getlocal_3", new int[]{}, false);
    }

    @Override
    public void execute(LocalDataArea lda, AVM2ConstantPool constants, AVM2Instruction ins) {
        lda.operandStack.push(lda.localRegisters.get(3));
    }

    @Override
    public int getRegisterId(AVM2Instruction par0) {
        return 3;
    }
}
