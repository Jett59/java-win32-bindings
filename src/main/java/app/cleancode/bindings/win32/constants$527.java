// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$527 {

    static final FunctionDescriptor SetPortA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPortA$MH = RuntimeHelper.downcallHandle(
        "SetPortA",
        constants$527.SetPortA$FUNC
    );
    static final FunctionDescriptor SetPortW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPortW$MH = RuntimeHelper.downcallHandle(
        "SetPortW",
        constants$527.SetPortW$FUNC
    );
    static final FunctionDescriptor AddPrinterConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterConnectionA$MH = RuntimeHelper.downcallHandle(
        "AddPrinterConnectionA",
        constants$527.AddPrinterConnectionA$FUNC
    );
    static final FunctionDescriptor AddPrinterConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterConnectionW$MH = RuntimeHelper.downcallHandle(
        "AddPrinterConnectionW",
        constants$527.AddPrinterConnectionW$FUNC
    );
    static final FunctionDescriptor DeletePrinterConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterConnectionA$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterConnectionA",
        constants$527.DeletePrinterConnectionA$FUNC
    );
    static final FunctionDescriptor DeletePrinterConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterConnectionW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterConnectionW",
        constants$527.DeletePrinterConnectionW$FUNC
    );
}

