// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$680 {

    static final FunctionDescriptor SetDefaultPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDefaultPrinterA$MH = RuntimeHelper.downcallHandle(
        "SetDefaultPrinterA",
        constants$680.SetDefaultPrinterA$FUNC
    );
    static final FunctionDescriptor SetDefaultPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDefaultPrinterW$MH = RuntimeHelper.downcallHandle(
        "SetDefaultPrinterW",
        constants$680.SetDefaultPrinterW$FUNC
    );
    static final FunctionDescriptor SetPortA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPortA$MH = RuntimeHelper.downcallHandle(
        "SetPortA",
        constants$680.SetPortA$FUNC
    );
    static final FunctionDescriptor SetPortW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPortW$MH = RuntimeHelper.downcallHandle(
        "SetPortW",
        constants$680.SetPortW$FUNC
    );
    static final FunctionDescriptor AddPrinterConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterConnectionA$MH = RuntimeHelper.downcallHandle(
        "AddPrinterConnectionA",
        constants$680.AddPrinterConnectionA$FUNC
    );
    static final FunctionDescriptor AddPrinterConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterConnectionW$MH = RuntimeHelper.downcallHandle(
        "AddPrinterConnectionW",
        constants$680.AddPrinterConnectionW$FUNC
    );
}


