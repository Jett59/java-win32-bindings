// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$381 {

    static final FunctionDescriptor GetPointerPenInfoHistory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerPenInfoHistory$MH = RuntimeHelper.downcallHandle(
        "GetPointerPenInfoHistory",
        constants$381.GetPointerPenInfoHistory$FUNC
    );
    static final FunctionDescriptor GetPointerFramePenInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerFramePenInfo$MH = RuntimeHelper.downcallHandle(
        "GetPointerFramePenInfo",
        constants$381.GetPointerFramePenInfo$FUNC
    );
    static final FunctionDescriptor GetPointerFramePenInfoHistory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerFramePenInfoHistory$MH = RuntimeHelper.downcallHandle(
        "GetPointerFramePenInfoHistory",
        constants$381.GetPointerFramePenInfoHistory$FUNC
    );
    static final FunctionDescriptor SkipPointerFrameMessages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SkipPointerFrameMessages$MH = RuntimeHelper.downcallHandle(
        "SkipPointerFrameMessages",
        constants$381.SkipPointerFrameMessages$FUNC
    );
    static final FunctionDescriptor RegisterPointerInputTarget$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterPointerInputTarget$MH = RuntimeHelper.downcallHandle(
        "RegisterPointerInputTarget",
        constants$381.RegisterPointerInputTarget$FUNC
    );
    static final FunctionDescriptor UnregisterPointerInputTarget$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterPointerInputTarget$MH = RuntimeHelper.downcallHandle(
        "UnregisterPointerInputTarget",
        constants$381.UnregisterPointerInputTarget$FUNC
    );
}


