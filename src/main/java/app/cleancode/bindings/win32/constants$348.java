// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$348 {

    static final FunctionDescriptor GetGestureInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGestureInfo$MH = RuntimeHelper.downcallHandle(
        "GetGestureInfo",
        constants$348.GetGestureInfo$FUNC
    );
    static final FunctionDescriptor GetGestureExtraArgs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGestureExtraArgs$MH = RuntimeHelper.downcallHandle(
        "GetGestureExtraArgs",
        constants$348.GetGestureExtraArgs$FUNC
    );
    static final FunctionDescriptor CloseGestureInfoHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseGestureInfoHandle$MH = RuntimeHelper.downcallHandle(
        "CloseGestureInfoHandle",
        constants$348.CloseGestureInfoHandle$FUNC
    );
    static final FunctionDescriptor SetGestureConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetGestureConfig$MH = RuntimeHelper.downcallHandle(
        "SetGestureConfig",
        constants$348.SetGestureConfig$FUNC
    );
    static final FunctionDescriptor GetGestureConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetGestureConfig$MH = RuntimeHelper.downcallHandle(
        "GetGestureConfig",
        constants$348.GetGestureConfig$FUNC
    );
    static final FunctionDescriptor ShutdownBlockReasonCreate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShutdownBlockReasonCreate$MH = RuntimeHelper.downcallHandle(
        "ShutdownBlockReasonCreate",
        constants$348.ShutdownBlockReasonCreate$FUNC
    );
}


