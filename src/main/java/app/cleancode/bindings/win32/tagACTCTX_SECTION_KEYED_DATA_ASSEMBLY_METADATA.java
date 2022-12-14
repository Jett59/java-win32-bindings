// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpInformation"),
        Constants$root.C_POINTER$LAYOUT.withName("lpSectionBase"),
        Constants$root.C_LONG$LAYOUT.withName("ulSectionLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpSectionGlobalDataBase"),
        Constants$root.C_LONG$LAYOUT.withName("ulSectionGlobalDataLength"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA");
    public static MemoryLayout $LAYOUT() {
        return tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.$struct$LAYOUT;
    }
    static final VarHandle lpInformation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpInformation"));
    public static VarHandle lpInformation$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpInformation$VH;
    }
    public static MemoryAddress lpInformation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpInformation$VH.get(seg);
    }
    public static void lpInformation$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpInformation$VH.set(seg, x);
    }
    public static MemoryAddress lpInformation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpInformation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpInformation$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpInformation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSectionBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSectionBase"));
    public static VarHandle lpSectionBase$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionBase$VH;
    }
    public static MemoryAddress lpSectionBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionBase$VH.get(seg);
    }
    public static void lpSectionBase$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionBase$VH.set(seg, x);
    }
    public static MemoryAddress lpSectionBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSectionBase$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulSectionLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSectionLength"));
    public static VarHandle ulSectionLength$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionLength$VH;
    }
    public static int ulSectionLength$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionLength$VH.get(seg);
    }
    public static void ulSectionLength$set( MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionLength$VH.set(seg, x);
    }
    public static int ulSectionLength$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSectionLength$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSectionGlobalDataBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSectionGlobalDataBase"));
    public static VarHandle lpSectionGlobalDataBase$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionGlobalDataBase$VH;
    }
    public static MemoryAddress lpSectionGlobalDataBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionGlobalDataBase$VH.get(seg);
    }
    public static void lpSectionGlobalDataBase$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionGlobalDataBase$VH.set(seg, x);
    }
    public static MemoryAddress lpSectionGlobalDataBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionGlobalDataBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSectionGlobalDataBase$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.lpSectionGlobalDataBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulSectionGlobalDataLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSectionGlobalDataLength"));
    public static VarHandle ulSectionGlobalDataLength$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionGlobalDataLength$VH;
    }
    public static int ulSectionGlobalDataLength$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionGlobalDataLength$VH.get(seg);
    }
    public static void ulSectionGlobalDataLength$set( MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionGlobalDataLength$VH.set(seg, x);
    }
    public static int ulSectionGlobalDataLength$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionGlobalDataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSectionGlobalDataLength$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA.ulSectionGlobalDataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


