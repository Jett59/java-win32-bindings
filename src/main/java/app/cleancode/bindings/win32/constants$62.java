// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor CUSTOM_SYSTEM_EVENT_TRIGGER_INIT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CUSTOM_SYSTEM_EVENT_TRIGGER_INIT$MH = RuntimeHelper.downcallHandle(
        "CUSTOM_SYSTEM_EVENT_TRIGGER_INIT",
        constants$62.CUSTOM_SYSTEM_EVENT_TRIGGER_INIT$FUNC
    );
    static final FunctionDescriptor RtlRaiseCustomSystemEventTrigger$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlRaiseCustomSystemEventTrigger$MH = RuntimeHelper.downcallHandle(
        "RtlRaiseCustomSystemEventTrigger",
        constants$62.RtlRaiseCustomSystemEventTrigger$FUNC
    );
    static final FunctionDescriptor RtlIsZeroMemory$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlIsZeroMemory$MH = RuntimeHelper.downcallHandle(
        "RtlIsZeroMemory",
        constants$62.RtlIsZeroMemory$FUNC
    );
    static final FunctionDescriptor RtlNormalizeSecurityDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RtlNormalizeSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        "RtlNormalizeSecurityDescriptor",
        constants$62.RtlNormalizeSecurityDescriptor$FUNC
    );
    static final FunctionDescriptor PAPCFUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PAPCFUNC$MH = RuntimeHelper.downcallHandle(
        constants$62.PAPCFUNC$FUNC
    );
}


