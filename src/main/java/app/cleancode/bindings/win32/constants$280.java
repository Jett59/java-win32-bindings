// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$280 {

    static final FunctionDescriptor PackTouchHitTestingProximityEvaluation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PackTouchHitTestingProximityEvaluation$MH = RuntimeHelper.downcallHandle(
        "PackTouchHitTestingProximityEvaluation",
        constants$280.PackTouchHitTestingProximityEvaluation$FUNC
    );
    static final FunctionDescriptor GetWindowFeedbackSetting$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowFeedbackSetting$MH = RuntimeHelper.downcallHandle(
        "GetWindowFeedbackSetting",
        constants$280.GetWindowFeedbackSetting$FUNC
    );
    static final FunctionDescriptor SetWindowFeedbackSetting$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowFeedbackSetting$MH = RuntimeHelper.downcallHandle(
        "SetWindowFeedbackSetting",
        constants$280.SetWindowFeedbackSetting$FUNC
    );
    static final FunctionDescriptor GetPointerInputTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerInputTransform$MH = RuntimeHelper.downcallHandle(
        "GetPointerInputTransform",
        constants$280.GetPointerInputTransform$FUNC
    );
    static final FunctionDescriptor GetLastInputInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLastInputInfo$MH = RuntimeHelper.downcallHandle(
        "GetLastInputInfo",
        constants$280.GetLastInputInfo$FUNC
    );
    static final FunctionDescriptor MapVirtualKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapVirtualKeyA$MH = RuntimeHelper.downcallHandle(
        "MapVirtualKeyA",
        constants$280.MapVirtualKeyA$FUNC
    );
}


