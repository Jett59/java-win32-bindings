// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$256 {

    static final FunctionDescriptor APPLICATION_RECOVERY_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle APPLICATION_RECOVERY_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$256.APPLICATION_RECOVERY_CALLBACK$FUNC
    );
    static final FunctionDescriptor RegisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "RegisterApplicationRecoveryCallback",
        constants$256.RegisterApplicationRecoveryCallback$FUNC
    );
    static final FunctionDescriptor UnregisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle UnregisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "UnregisterApplicationRecoveryCallback",
        constants$256.UnregisterApplicationRecoveryCallback$FUNC
    );
    static final FunctionDescriptor RegisterApplicationRestart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterApplicationRestart$MH = RuntimeHelper.downcallHandle(
        "RegisterApplicationRestart",
        constants$256.RegisterApplicationRestart$FUNC
    );
    static final FunctionDescriptor UnregisterApplicationRestart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle UnregisterApplicationRestart$MH = RuntimeHelper.downcallHandle(
        "UnregisterApplicationRestart",
        constants$256.UnregisterApplicationRestart$FUNC
    );
}


