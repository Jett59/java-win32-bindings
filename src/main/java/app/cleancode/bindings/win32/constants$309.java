// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$309 {

    static final FunctionDescriptor EndDoc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndDoc$MH = RuntimeHelper.downcallHandle(
        "EndDoc",
        constants$309.EndDoc$FUNC
    );
    static final FunctionDescriptor StartPage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartPage$MH = RuntimeHelper.downcallHandle(
        "StartPage",
        constants$309.StartPage$FUNC
    );
    static final FunctionDescriptor EndPage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndPage$MH = RuntimeHelper.downcallHandle(
        "EndPage",
        constants$309.EndPage$FUNC
    );
    static final FunctionDescriptor AbortDoc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AbortDoc$MH = RuntimeHelper.downcallHandle(
        "AbortDoc",
        constants$309.AbortDoc$FUNC
    );
    static final FunctionDescriptor SetAbortProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetAbortProc$MH = RuntimeHelper.downcallHandle(
        "SetAbortProc",
        constants$309.SetAbortProc$FUNC
    );
    static final FunctionDescriptor AbortPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AbortPath$MH = RuntimeHelper.downcallHandle(
        "AbortPath",
        constants$309.AbortPath$FUNC
    );
}


