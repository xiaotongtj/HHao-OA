package com.yj.oa.project.po;

import com.yj.oa.framework.web.po.BasePo;

import java.util.Date;
import java.util.List;

public class Role extends BasePo{
    /**
     * This field was generated by MyBatis Generator.
     * 角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * 角色名称
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * 说明
     *
     * @mbggenerated
     */
    private String descr;


    /*
     *
     * 创建时间
     *
     * */
    private Date createTime;

//    状态
    private int status;




    /*
     * 角色包含权限
     *
     * */
    private List<Permission> permissionList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getRoleId() {
        return roleId;
    }


    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }


    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }


    public String getDescr() {
        return descr;
    }


    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("Role{");
        sb.append("roleId=").append(roleId);
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", descr='").append(descr).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", permissionList=").append(permissionList);
        sb.append('}');
        return sb.toString();
    }
}