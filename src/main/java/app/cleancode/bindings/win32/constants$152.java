// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$152 {

    static final FunctionDescriptor GetNumaProximityNode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProximityNode$MH = RuntimeHelper.downcallHandle(
        "GetNumaProximityNode",
        constants$152.GetNumaProximityNode$FUNC
    );
    static final FunctionDescriptor APPLICATION_RECOVERY_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle APPLICATION_RECOVERY_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$152.APPLICATION_RECOVERY_CALLBACK$FUNC
    );
    static final FunctionDescriptor RegisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "RegisterApplicationRecoveryCallback",
        constants$152.RegisterApplicationRecoveryCallback$FUNC
    );
    static final FunctionDescriptor UnregisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle UnregisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "UnregisterApplicationRecoveryCallback",
        constants$152.UnregisterApplicationRecoveryCallback$FUNC
    );
    static final FunctionDescriptor RegisterApplicationRestart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterApplicationRestart$MH = RuntimeHelper.downcallHandle(
        "RegisterApplicationRestart",
        constants$152.RegisterApplicationRestart$FUNC
    );
}

