// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$310 {

    static final FunctionDescriptor SetCaretPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCaretPos$MH = RuntimeHelper.downcallHandle(
        "SetCaretPos",
        constants$310.SetCaretPos$FUNC
    );
    static final FunctionDescriptor GetCaretPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCaretPos$MH = RuntimeHelper.downcallHandle(
        "GetCaretPos",
        constants$310.GetCaretPos$FUNC
    );
    static final FunctionDescriptor ClientToScreen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClientToScreen$MH = RuntimeHelper.downcallHandle(
        "ClientToScreen",
        constants$310.ClientToScreen$FUNC
    );
    static final FunctionDescriptor ScreenToClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScreenToClient$MH = RuntimeHelper.downcallHandle(
        "ScreenToClient",
        constants$310.ScreenToClient$FUNC
    );
    static final FunctionDescriptor LogicalToPhysicalPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LogicalToPhysicalPoint$MH = RuntimeHelper.downcallHandle(
        "LogicalToPhysicalPoint",
        constants$310.LogicalToPhysicalPoint$FUNC
    );
    static final FunctionDescriptor PhysicalToLogicalPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PhysicalToLogicalPoint$MH = RuntimeHelper.downcallHandle(
        "PhysicalToLogicalPoint",
        constants$310.PhysicalToLogicalPoint$FUNC
    );
}


