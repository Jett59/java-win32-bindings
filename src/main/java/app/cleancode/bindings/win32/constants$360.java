// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$360 {

    static final FunctionDescriptor IsZoomed$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsZoomed$MH = RuntimeHelper.downcallHandle(
        "IsZoomed",
        constants$360.IsZoomed$FUNC
    );
    static final FunctionDescriptor CreateDialogParamA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CreateDialogParamA$MH = RuntimeHelper.downcallHandle(
        "CreateDialogParamA",
        constants$360.CreateDialogParamA$FUNC
    );
    static final FunctionDescriptor CreateDialogParamW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CreateDialogParamW$MH = RuntimeHelper.downcallHandle(
        "CreateDialogParamW",
        constants$360.CreateDialogParamW$FUNC
    );
    static final FunctionDescriptor CreateDialogIndirectParamA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CreateDialogIndirectParamA$MH = RuntimeHelper.downcallHandle(
        "CreateDialogIndirectParamA",
        constants$360.CreateDialogIndirectParamA$FUNC
    );
    static final FunctionDescriptor CreateDialogIndirectParamW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CreateDialogIndirectParamW$MH = RuntimeHelper.downcallHandle(
        "CreateDialogIndirectParamW",
        constants$360.CreateDialogIndirectParamW$FUNC
    );
    static final FunctionDescriptor DialogBoxParamA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DialogBoxParamA$MH = RuntimeHelper.downcallHandle(
        "DialogBoxParamA",
        constants$360.DialogBoxParamA$FUNC
    );
}


