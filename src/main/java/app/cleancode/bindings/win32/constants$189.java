// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$189 {

    static final FunctionDescriptor SetFileShortNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileShortNameW$MH = RuntimeHelper.downcallHandle(
        "SetFileShortNameW",
        constants$189.SetFileShortNameW$FUNC
    );
    static final FunctionDescriptor LoadModule$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadModule$MH = RuntimeHelper.downcallHandle(
        "LoadModule",
        constants$189.LoadModule$FUNC
    );
    static final FunctionDescriptor WinExec$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WinExec$MH = RuntimeHelper.downcallHandle(
        "WinExec",
        constants$189.WinExec$FUNC
    );
    static final FunctionDescriptor ClearCommBreak$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearCommBreak$MH = RuntimeHelper.downcallHandle(
        "ClearCommBreak",
        constants$189.ClearCommBreak$FUNC
    );
    static final FunctionDescriptor ClearCommError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearCommError$MH = RuntimeHelper.downcallHandle(
        "ClearCommError",
        constants$189.ClearCommError$FUNC
    );
    static final FunctionDescriptor SetupComm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetupComm$MH = RuntimeHelper.downcallHandle(
        "SetupComm",
        constants$189.SetupComm$FUNC
    );
}


