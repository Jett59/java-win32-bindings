// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$661 {

    static final FunctionDescriptor OpenPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrinterA$MH = RuntimeHelper.downcallHandle(
        "OpenPrinterA",
        constants$661.OpenPrinterA$FUNC
    );
    static final FunctionDescriptor OpenPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrinterW$MH = RuntimeHelper.downcallHandle(
        "OpenPrinterW",
        constants$661.OpenPrinterW$FUNC
    );
    static final FunctionDescriptor ResetPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetPrinterA$MH = RuntimeHelper.downcallHandle(
        "ResetPrinterA",
        constants$661.ResetPrinterA$FUNC
    );
    static final FunctionDescriptor ResetPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetPrinterW$MH = RuntimeHelper.downcallHandle(
        "ResetPrinterW",
        constants$661.ResetPrinterW$FUNC
    );
    static final FunctionDescriptor SetJobA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetJobA$MH = RuntimeHelper.downcallHandle(
        "SetJobA",
        constants$661.SetJobA$FUNC
    );
    static final FunctionDescriptor SetJobW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetJobW$MH = RuntimeHelper.downcallHandle(
        "SetJobW",
        constants$661.SetJobW$FUNC
    );
}


