// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$383 {

    static final FunctionDescriptor IsMouseInPointerEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsMouseInPointerEnabled$MH = RuntimeHelper.downcallHandle(
        "IsMouseInPointerEnabled",
        constants$383.IsMouseInPointerEnabled$FUNC
    );
    static final FunctionDescriptor EnableMouseInPointerForThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle EnableMouseInPointerForThread$MH = RuntimeHelper.downcallHandle(
        "EnableMouseInPointerForThread",
        constants$383.EnableMouseInPointerForThread$FUNC
    );
    static final FunctionDescriptor RegisterTouchHitTestingWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterTouchHitTestingWindow$MH = RuntimeHelper.downcallHandle(
        "RegisterTouchHitTestingWindow",
        constants$383.RegisterTouchHitTestingWindow$FUNC
    );
    static final FunctionDescriptor EvaluateProximityToRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvaluateProximityToRect$MH = RuntimeHelper.downcallHandle(
        "EvaluateProximityToRect",
        constants$383.EvaluateProximityToRect$FUNC
    );
    static final FunctionDescriptor EvaluateProximityToPolygon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvaluateProximityToPolygon$MH = RuntimeHelper.downcallHandle(
        "EvaluateProximityToPolygon",
        constants$383.EvaluateProximityToPolygon$FUNC
    );
    static final FunctionDescriptor PackTouchHitTestingProximityEvaluation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PackTouchHitTestingProximityEvaluation$MH = RuntimeHelper.downcallHandle(
        "PackTouchHitTestingProximityEvaluation",
        constants$383.PackTouchHitTestingProximityEvaluation$FUNC
    );
}


