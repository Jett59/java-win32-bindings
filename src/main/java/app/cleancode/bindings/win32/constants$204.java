// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$204 {

    static final FunctionDescriptor SetColorAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetColorAdjustment$MH = RuntimeHelper.downcallHandle(
        "SetColorAdjustment",
        constants$204.SetColorAdjustment$FUNC
    );
    static final FunctionDescriptor GetColorAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetColorAdjustment$MH = RuntimeHelper.downcallHandle(
        "GetColorAdjustment",
        constants$204.GetColorAdjustment$FUNC
    );
    static final FunctionDescriptor CreateHalftonePalette$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateHalftonePalette$MH = RuntimeHelper.downcallHandle(
        "CreateHalftonePalette",
        constants$204.CreateHalftonePalette$FUNC
    );
    static final FunctionDescriptor ABORTPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ABORTPROC$MH = RuntimeHelper.downcallHandle(
        constants$204.ABORTPROC$FUNC
    );
    static final FunctionDescriptor StartDocA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartDocA$MH = RuntimeHelper.downcallHandle(
        "StartDocA",
        constants$204.StartDocA$FUNC
    );
}

