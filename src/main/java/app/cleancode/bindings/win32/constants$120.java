// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$120 {

    static final FunctionDescriptor UpdateProcThreadAttribute$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateProcThreadAttribute$MH = RuntimeHelper.downcallHandle(
        "UpdateProcThreadAttribute",
        constants$120.UpdateProcThreadAttribute$FUNC
    );
    static final FunctionDescriptor SetProcessDynamicEHContinuationTargets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessDynamicEHContinuationTargets$MH = RuntimeHelper.downcallHandle(
        "SetProcessDynamicEHContinuationTargets",
        constants$120.SetProcessDynamicEHContinuationTargets$FUNC
    );
    static final FunctionDescriptor SetProcessDynamicEnforcedCetCompatibleRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessDynamicEnforcedCetCompatibleRanges$MH = RuntimeHelper.downcallHandle(
        "SetProcessDynamicEnforcedCetCompatibleRanges",
        constants$120.SetProcessDynamicEnforcedCetCompatibleRanges$FUNC
    );
    static final FunctionDescriptor SetProcessAffinityUpdateMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessAffinityUpdateMode$MH = RuntimeHelper.downcallHandle(
        "SetProcessAffinityUpdateMode",
        constants$120.SetProcessAffinityUpdateMode$FUNC
    );
    static final FunctionDescriptor QueryProcessAffinityUpdateMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProcessAffinityUpdateMode$MH = RuntimeHelper.downcallHandle(
        "QueryProcessAffinityUpdateMode",
        constants$120.QueryProcessAffinityUpdateMode$FUNC
    );
    static final FunctionDescriptor CreateRemoteThreadEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateRemoteThreadEx$MH = RuntimeHelper.downcallHandle(
        "CreateRemoteThreadEx",
        constants$120.CreateRemoteThreadEx$FUNC
    );
}


