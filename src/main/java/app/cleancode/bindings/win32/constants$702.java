// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$702 {

    static final FunctionDescriptor CoRegisterDeviceCatalog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterDeviceCatalog$MH = RuntimeHelper.downcallHandle(
        "CoRegisterDeviceCatalog",
        constants$702.CoRegisterDeviceCatalog$FUNC
    );
    static final FunctionDescriptor CoRevokeDeviceCatalog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRevokeDeviceCatalog$MH = RuntimeHelper.downcallHandle(
        "CoRevokeDeviceCatalog",
        constants$702.CoRevokeDeviceCatalog$FUNC
    );
    static final FunctionDescriptor StgCreateDocfile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgCreateDocfile$MH = RuntimeHelper.downcallHandle(
        "StgCreateDocfile",
        constants$702.StgCreateDocfile$FUNC
    );
    static final FunctionDescriptor StgCreateDocfileOnILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgCreateDocfileOnILockBytes$MH = RuntimeHelper.downcallHandle(
        "StgCreateDocfileOnILockBytes",
        constants$702.StgCreateDocfileOnILockBytes$FUNC
    );
    static final FunctionDescriptor StgOpenStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgOpenStorage$MH = RuntimeHelper.downcallHandle(
        "StgOpenStorage",
        constants$702.StgOpenStorage$FUNC
    );
    static final FunctionDescriptor StgOpenStorageOnILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StgOpenStorageOnILockBytes$MH = RuntimeHelper.downcallHandle(
        "StgOpenStorageOnILockBytes",
        constants$702.StgOpenStorageOnILockBytes$FUNC
    );
}


