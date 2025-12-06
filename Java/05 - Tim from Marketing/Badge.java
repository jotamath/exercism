class Badge {
    public String print(Integer id, String name, String department) {
      return buildLabel(id, name, formatDepartment(department));
    }

    public String formatDepartment(String department) {
        return (department == null) ? "OWNER" : department.toUpperCase();
    }

    public String buildLabel(Integer id, String name, String dept) {
        return (id == null) 
        ? String.format("%s - %s", name, dept)
        : String.format("[%d] - %s - %s", id, name, dept);
    }
}
