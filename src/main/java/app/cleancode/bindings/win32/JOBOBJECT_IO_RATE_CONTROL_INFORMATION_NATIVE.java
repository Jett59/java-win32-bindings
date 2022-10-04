// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxIops"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxBandwidth"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ReservationIops"),
        Constants$root.C_POINTER$LAYOUT.withName("VolumeName"),
        Constants$root.C_LONG$LAYOUT.withName("BaseIoSize"),
        Constants$root.C_LONG$LAYOUT.withName("ControlFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("VolumeNameLength"),
        MemoryLayout.paddingLayout(48)
    ).withName("JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE");
    public static MemoryLayout $LAYOUT() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.$struct$LAYOUT;
    }
    static final VarHandle MaxIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxIops"));
    public static VarHandle MaxIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxIops$VH;
    }
    public static long MaxIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxIops$VH.get(seg);
    }
    public static void MaxIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxIops$VH.set(seg, x);
    }
    public static long MaxIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxBandwidth"));
    public static VarHandle MaxBandwidth$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxBandwidth$VH;
    }
    public static long MaxBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxBandwidth$VH.get(seg);
    }
    public static void MaxBandwidth$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxBandwidth$VH.set(seg, x);
    }
    public static long MaxBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.MaxBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservationIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservationIops"));
    public static VarHandle ReservationIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ReservationIops$VH;
    }
    public static long ReservationIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ReservationIops$VH.get(seg);
    }
    public static void ReservationIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ReservationIops$VH.set(seg, x);
    }
    public static long ReservationIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ReservationIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ReservationIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeName"));
    public static VarHandle VolumeName$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeName$VH;
    }
    public static MemoryAddress VolumeName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeName$VH.get(seg);
    }
    public static void VolumeName$set( MemorySegment seg, MemoryAddress x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeName$VH.set(seg, x);
    }
    public static MemoryAddress VolumeName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeName$set(MemorySegment seg, long index, MemoryAddress x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseIoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseIoSize"));
    public static VarHandle BaseIoSize$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.BaseIoSize$VH;
    }
    public static int BaseIoSize$get(MemorySegment seg) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.BaseIoSize$VH.get(seg);
    }
    public static void BaseIoSize$set( MemorySegment seg, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.BaseIoSize$VH.set(seg, x);
    }
    public static int BaseIoSize$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.BaseIoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseIoSize$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.BaseIoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ControlFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlFlags"));
    public static VarHandle ControlFlags$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ControlFlags$VH;
    }
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ControlFlags$VH.get(seg);
    }
    public static void ControlFlags$set( MemorySegment seg, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ControlFlags$VH.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ControlFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.ControlFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeNameLength"));
    public static VarHandle VolumeNameLength$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeNameLength$VH;
    }
    public static short VolumeNameLength$get(MemorySegment seg) {
        return (short)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeNameLength$VH.get(seg);
    }
    public static void VolumeNameLength$set( MemorySegment seg, short x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeNameLength$VH.set(seg, x);
    }
    public static short VolumeNameLength$get(MemorySegment seg, long index) {
        return (short)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeNameLength$set(MemorySegment seg, long index, short x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE.VolumeNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

