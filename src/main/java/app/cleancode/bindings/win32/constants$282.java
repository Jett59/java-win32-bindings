// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$282 {

    static final FunctionDescriptor SetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCapture$MH = RuntimeHelper.downcallHandle(
        "SetCapture",
        constants$282.SetCapture$FUNC
    );
    static final FunctionDescriptor ReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "ReleaseCapture",
        constants$282.ReleaseCapture$FUNC
    );
    static final FunctionDescriptor MsgWaitForMultipleObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MsgWaitForMultipleObjects$MH = RuntimeHelper.downcallHandle(
        "MsgWaitForMultipleObjects",
        constants$282.MsgWaitForMultipleObjects$FUNC
    );
    static final FunctionDescriptor MsgWaitForMultipleObjectsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MsgWaitForMultipleObjectsEx$MH = RuntimeHelper.downcallHandle(
        "MsgWaitForMultipleObjectsEx",
        constants$282.MsgWaitForMultipleObjectsEx$FUNC
    );
    static final FunctionDescriptor SetTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetTimer$MH = RuntimeHelper.downcallHandle(
        "SetTimer",
        constants$282.SetTimer$FUNC
    );
    static final FunctionDescriptor SetCoalescableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCoalescableTimer$MH = RuntimeHelper.downcallHandle(
        "SetCoalescableTimer",
        constants$282.SetCoalescableTimer$FUNC
    );
}

