// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$66 {

    static final FunctionDescriptor PTP_SIMPLE_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_SIMPLE_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$66.PTP_SIMPLE_CALLBACK$FUNC
    );
    static final FunctionDescriptor PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_CLEANUP_GROUP_CANCEL_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$66.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC
    );
    static final FunctionDescriptor TpInitializeCallbackEnviron$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpInitializeCallbackEnviron$MH = RuntimeHelper.downcallHandle(
        "TpInitializeCallbackEnviron",
        constants$66.TpInitializeCallbackEnviron$FUNC
    );
    static final FunctionDescriptor TpSetCallbackThreadpool$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackThreadpool$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackThreadpool",
        constants$66.TpSetCallbackThreadpool$FUNC
    );
    static final FunctionDescriptor TpSetCallbackCleanupGroup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackCleanupGroup$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackCleanupGroup",
        constants$66.TpSetCallbackCleanupGroup$FUNC
    );
}


