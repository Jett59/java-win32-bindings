// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$176 {

    static final FunctionDescriptor GlobalFlags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFlags$MH = RuntimeHelper.downcallHandle(
        "GlobalFlags",
        constants$176.GlobalFlags$FUNC
    );
    static final FunctionDescriptor GlobalHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalHandle$MH = RuntimeHelper.downcallHandle(
        "GlobalHandle",
        constants$176.GlobalHandle$FUNC
    );
    static final FunctionDescriptor GlobalFree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFree$MH = RuntimeHelper.downcallHandle(
        "GlobalFree",
        constants$176.GlobalFree$FUNC
    );
    static final FunctionDescriptor GlobalCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalCompact$MH = RuntimeHelper.downcallHandle(
        "GlobalCompact",
        constants$176.GlobalCompact$FUNC
    );
    static final FunctionDescriptor GlobalFix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFix$MH = RuntimeHelper.downcallHandle(
        "GlobalFix",
        constants$176.GlobalFix$FUNC
    );
    static final FunctionDescriptor GlobalUnfix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalUnfix$MH = RuntimeHelper.downcallHandle(
        "GlobalUnfix",
        constants$176.GlobalUnfix$FUNC
    );
}


