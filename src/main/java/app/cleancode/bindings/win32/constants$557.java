// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$557 {

    static final FunctionDescriptor PM_QUERY_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_QUERY_PROC$MH = RuntimeHelper.downcallHandle(
        constants$557.PM_QUERY_PROC$FUNC
    );
    static final FunctionDescriptor accept$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle accept$MH = RuntimeHelper.downcallHandle(
        "accept",
        constants$557.accept$FUNC
    );
    static final FunctionDescriptor bind$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle bind$MH = RuntimeHelper.downcallHandle(
        "bind",
        constants$557.bind$FUNC
    );
    static final FunctionDescriptor closesocket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle closesocket$MH = RuntimeHelper.downcallHandle(
        "closesocket",
        constants$557.closesocket$FUNC
    );
    static final FunctionDescriptor connect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle connect$MH = RuntimeHelper.downcallHandle(
        "connect",
        constants$557.connect$FUNC
    );
}


