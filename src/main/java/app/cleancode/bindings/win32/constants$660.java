// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$660 {

    static final FunctionDescriptor SCardAudit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardAudit$MH = RuntimeHelper.downcallHandle(
        "SCardAudit",
        constants$660.SCardAudit$FUNC
    );
    static final FunctionDescriptor EnumPrintersA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumPrintersA$MH = RuntimeHelper.downcallHandle(
        "EnumPrintersA",
        constants$660.EnumPrintersA$FUNC
    );
    static final FunctionDescriptor EnumPrintersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumPrintersW$MH = RuntimeHelper.downcallHandle(
        "EnumPrintersW",
        constants$660.EnumPrintersW$FUNC
    );
    static final FunctionDescriptor GetSpoolFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        "GetSpoolFileHandle",
        constants$660.GetSpoolFileHandle$FUNC
    );
    static final FunctionDescriptor CommitSpoolData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CommitSpoolData$MH = RuntimeHelper.downcallHandle(
        "CommitSpoolData",
        constants$660.CommitSpoolData$FUNC
    );
    static final FunctionDescriptor CloseSpoolFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        "CloseSpoolFileHandle",
        constants$660.CloseSpoolFileHandle$FUNC
    );
}


