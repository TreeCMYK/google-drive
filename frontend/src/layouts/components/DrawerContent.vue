<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Dashboard' }" />
        <VerticalNavLink
            :item="{
                title: 'Dashboard',
                to: '/dashboards',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Drive' }" />
        <VerticalNavLink
            :item="{
                title: 'File',
                to: '/files',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Indexer' }" />
        <VerticalNavLink
            :item="{
                title: 'Index',
                to: '/indices',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'VideoProcessing' }" />
        <VerticalNavLink
            :item="{
                title: 'Video',
                to: '/videos',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Notification' }" />
    </ul>
</template>
