// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$477 {

    static final FunctionDescriptor EnumSystemCodePagesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnumSystemCodePagesA$MH = RuntimeHelper.downcallHandle(
        "EnumSystemCodePagesA",
        constants$477.EnumSystemCodePagesA$FUNC
    );
    static final FunctionDescriptor EnumSystemCodePagesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnumSystemCodePagesW$MH = RuntimeHelper.downcallHandle(
        "EnumSystemCodePagesW",
        constants$477.EnumSystemCodePagesW$FUNC
    );
    static final FunctionDescriptor IdnToAscii$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IdnToAscii$MH = RuntimeHelper.downcallHandle(
        "IdnToAscii",
        constants$477.IdnToAscii$FUNC
    );
    static final FunctionDescriptor IdnToUnicode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IdnToUnicode$MH = RuntimeHelper.downcallHandle(
        "IdnToUnicode",
        constants$477.IdnToUnicode$FUNC
    );
    static final FunctionDescriptor IdnToNameprepUnicode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IdnToNameprepUnicode$MH = RuntimeHelper.downcallHandle(
        "IdnToNameprepUnicode",
        constants$477.IdnToNameprepUnicode$FUNC
    );
    static final FunctionDescriptor NormalizeString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NormalizeString$MH = RuntimeHelper.downcallHandle(
        "NormalizeString",
        constants$477.NormalizeString$FUNC
    );
}


