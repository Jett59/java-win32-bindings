// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$91 {

    static final FunctionDescriptor WaitCommEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitCommEvent$MH = RuntimeHelper.downcallHandle(
        "WaitCommEvent",
        constants$91.WaitCommEvent$FUNC
    );
    static final FunctionDescriptor OpenCommPort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenCommPort$MH = RuntimeHelper.downcallHandle(
        "OpenCommPort",
        constants$91.OpenCommPort$FUNC
    );
    static final FunctionDescriptor GetCommPorts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommPorts$MH = RuntimeHelper.downcallHandle(
        "GetCommPorts",
        constants$91.GetCommPorts$FUNC
    );
    static final FunctionDescriptor SetTapePosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTapePosition$MH = RuntimeHelper.downcallHandle(
        "SetTapePosition",
        constants$91.SetTapePosition$FUNC
    );
    static final FunctionDescriptor GetTapePosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTapePosition$MH = RuntimeHelper.downcallHandle(
        "GetTapePosition",
        constants$91.GetTapePosition$FUNC
    );
    static final FunctionDescriptor PrepareTape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrepareTape$MH = RuntimeHelper.downcallHandle(
        "PrepareTape",
        constants$91.PrepareTape$FUNC
    );
}


