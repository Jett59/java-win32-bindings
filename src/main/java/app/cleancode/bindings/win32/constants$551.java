// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$551 {

    static final FunctionDescriptor SHGetStockIconInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetStockIconInfo$MH = RuntimeHelper.downcallHandle(
        "SHGetStockIconInfo",
        constants$551.SHGetStockIconInfo$FUNC
    );
    static final FunctionDescriptor SHGetDiskFreeSpaceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetDiskFreeSpaceExA$MH = RuntimeHelper.downcallHandle(
        "SHGetDiskFreeSpaceExA",
        constants$551.SHGetDiskFreeSpaceExA$FUNC
    );
    static final FunctionDescriptor SHGetDiskFreeSpaceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetDiskFreeSpaceExW$MH = RuntimeHelper.downcallHandle(
        "SHGetDiskFreeSpaceExW",
        constants$551.SHGetDiskFreeSpaceExW$FUNC
    );
    static final FunctionDescriptor SHGetNewLinkInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHGetNewLinkInfoA$MH = RuntimeHelper.downcallHandle(
        "SHGetNewLinkInfoA",
        constants$551.SHGetNewLinkInfoA$FUNC
    );
    static final FunctionDescriptor SHGetNewLinkInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHGetNewLinkInfoW$MH = RuntimeHelper.downcallHandle(
        "SHGetNewLinkInfoW",
        constants$551.SHGetNewLinkInfoW$FUNC
    );
    static final FunctionDescriptor SHInvokePrinterCommandA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHInvokePrinterCommandA$MH = RuntimeHelper.downcallHandle(
        "SHInvokePrinterCommandA",
        constants$551.SHInvokePrinterCommandA$FUNC
    );
}


